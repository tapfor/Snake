package com.example.rev.snake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;
    TableRow[]tableRows;
    ImageView[]imgNew;
    int [][]pole;
//chansge the comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int row = 20;
        int col = 10;
        int numOfElements  = row * col;
        int numberFields = 0;
        pole= new int[row][col];

        tableLayout = (TableLayout)findViewById(R.id.TableLayout);
        tableRows = new TableRow[row];
        imgNew = new ImageView[numOfElements];

        for (int i =0;i<numOfElements;i++){
            imgNew[i] = new ImageView(this);
            imgNew[i].setId(i);
            imgNew[i].setBackgroundResource(R.drawable.gray_middle);
            imgNew[i].setLayoutParams(new TableRow.LayoutParams(-1,-1,1.0f));
        }
        for (int i=0;i<row;i++){
            tableRows[i] = new TableRow(this);
            tableRows[i].setLayoutParams(new TableLayout.LayoutParams(-1,-1,1.0f));
            for(int j=0;j<col;j++){
                tableRows[i].addView(imgNew[numberFields++]);
            }
        }
        for(int i =0;i<row;i++){
            tableLayout.addView(tableRows[i]);
        }
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                pole[i][j]=0;
            }
    }
}
