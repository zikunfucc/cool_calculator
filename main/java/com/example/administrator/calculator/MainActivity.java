package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private GridLayout mGridLayout;
    private int columnCount; // Grid列数
    private int rowCount;   // Grid行数
    private int screenWidth; // 屏幕宽度
    private int screenHeight; // 屏幕高度

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridLayout = (GridLayout) findViewById(R.id.gridLayout);
        columnCount = mGridLayout.getColumnCount();
        rowCount = mGridLayout.getRowCount();

        DisplayMetrics dm = this.getResources().getDisplayMetrics();
        int screenWidth = ((DisplayMetrics) dm).widthPixels;
        int screenHeight = dm.heightPixels;
//        Log.e("debug1", "row: " + rowCount + "; column: " + columnCount + ";  screenwidth: " + screenWidth);
        for (int i = 0; i < mGridLayout.getChildCount(); i++) {
            View view = mGridLayout.getChildAt(i);
            if (view instanceof Button) {
                Button button = (Button) view;
//                Log.d("debug1", "第" + i + "个view是button");
                button.setWidth(screenWidth / columnCount);
                button.setHeight(screenHeight / rowCount);
            } else if (view instanceof TextView) {
                TextView textview = (TextView) view;
//                Log.d("debug1", "第" + i + "个view是textview");
                textview.setWidth(screenWidth);
                textview.setHeight(screenHeight / rowCount);
            }
        }
    }

    public void zero_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (!s.equals("0")) {
            s = s + "0";
        }
        print2.setText(s);
    }

    public void one_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "1";
        } else {
            s = s + "1";
        }
        print2.setText(s);
    }

    public void two_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "2";
        } else {
            s = s + "2";
        }
        print2.setText(s);
    }

    public void three_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "3";
        } else {
            s = s + "3";
        }
        print2.setText(s);
    }

    public void four_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "4";
        } else {
            s = s + "4";
        }
        print2.setText(s);
    }

    public void five_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "5";
        } else {
            s = s + "5";
        }
        print2.setText(s);
    }

    public void six_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "6";
        } else {
            s = s + "6";
        }
        print2.setText(s);
    }

    public void seven_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "7";
        } else {
            s = s + "7";
        }
        print2.setText(s);
    }

    public void eight_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "8";
        } else {
            s = s + "8";
        }
        print2.setText(s);
    }

    public void nine_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.equals("0")) {
            s = "9";
        } else {
            s = s + "9";
        }
        print2.setText(s);
    }

    public void ce_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = "";
        String s2 = "0";
        print1.setText(s1);
        print2.setText(s2);
    }

    public void c_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s2 = "0";
        print2.setText(s2);
    }

    public void d_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (s.length() > 1) {
            s = s.substring(0, s.length() - 1);
        } else {
            s = "0";
        }
        print2.setText(s);
    }

    public void dot_clicked(View view) {
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s = print2.getText().toString();
        if (!s.contains(".")) {
            s = s + ".";
        }
        print2.setText(s);
    }

    public void zhengfu_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        if(!s1.equals("") && s2.equals("0") && s1.contains("=")) {
            s1 = s1.substring(s1.lastIndexOf("=") + 1, s1.length());
            if(!s1.startsWith("-")) {
                s1 = "-" + s1;
            } else{
                s1 = s1.substring(1, s1.length());
            }
            print1.setText(s1);
        } else if(!s1.equals("") && s2.equals("0") && !s1.contains("+") && !s1.contains("−") && !s1.contains("×") && !s1.contains("÷")) {
            if(!s1.startsWith("-")) {
                s1 = "-" + s1;
            } else{
                s1 = s1.substring(1, s1.length());
            }
            print1.setText(s1);
        }
        else if(!s2.equals("0")) {
            if(!s2.startsWith("-")) {
                s2 = "-" + s2;
            } else {
                s2 = s2.substring(1, s2.length());
            }
            print2.setText(s2);
        }
    }

    public void add_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        s2 = s2 + "+";
        if(s1.equals("")) {     // 必须放在第三个判断之前，否则会异常
            s1 = s2;
        } else if (s2.equals("0")) {
            s1 = s1 + "+";
        } else if (!Character.isDigit(s1.charAt(s1.length() - 1))) {
            s1 = s1 + s2;
        } else if(s1.contains("=") && s2.equals("0+")) {
            s1 = s1.substring(s1.lastIndexOf("=") + 1, s1.length());
            s1 = s1 + "+";
        } else if(!s1.equals("") && s2.equals("0+")) {
            s1 = s1 + "+";
        } else {
            s1 = s2;
        }
        print1.setText(s1);
        print2.setText("0");
    }

    public void reduce_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        s2 = s2 + "−";
        if(s1.equals("")) {
            s1 = s2;
        } else if (!Character.isDigit(s1.charAt(s1.length() - 1))) {
            s1 = s1 + s2;
        } else if (s2.equals("0")) {
            s1 = s1 + "-";
        } else if(s1.contains("=") && s2.equals("0−")) {
            s1 = s1.substring(s1.lastIndexOf("=") + 1, s1.length());
            s1 = s1 + "−";
        } else if(!s1.equals("") && s2.equals("0−")) {
            s1 = s1 + "−";
        } else {
            s1 = s2;
        }
        print1.setText(s1);
        print2.setText("0");
    }

    public void multiply_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        s2 = s2 + "×";
        if(s1.equals("")) {
            s1 = s2;
        } else if (!Character.isDigit(s1.charAt(s1.length() - 1))) {
            s1 = s1 + s2;
        } else if (s2.equals("0")) {
            s1 = s1 + "×";
        } else if(s1.contains("=") && s2.equals("0×")) {
            s1 = s1.substring(s1.lastIndexOf("=") + 1, s1.length());
            s1 = s1 + "×";
        } else if(!s1.equals("") && s2.equals("0×")) {
            s1 = s1 + "×";
        } else {
            s1 = s2;
        }
        print1.setText(s1);
        print2.setText("0");
    }

    public void divide_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        s2 = s2 + "÷";
        if(s1.equals("")) {
            s1 = s2;
        } else if (!Character.isDigit(s1.charAt(s1.length() - 1))) {
            s1 = s1 + s2;
        } else if (s2.equals("0")) {
            s1 = s1 + "÷";
        } else if(s1.contains("=") && s2.equals("0÷")) {
            s1 = s1.substring(s1.lastIndexOf("=") + 1, s1.length());
            s1 = s1 + "÷";
        } else if(!s1.equals("") && s2.equals("0÷")) {
            s1 = s1 + "÷";
        } else {
            s1 = s2;
        }
        print1.setText(s1);
        print2.setText("0");
    }

    public void equals_clicked(View view) {
        TextView print1 = (TextView) findViewById(R.id.print1);
        TextView print2 = (TextView) findViewById(R.id.print2);
        String s1 = print1.getText().toString();
        String s2 = print2.getText().toString();
        if (s1.equals("")) {
            s1 = s2;
        } else if (Character.isDigit(s1.charAt(s1.length() - 1))) {
            s1 = s2;
        } else {
            String result = simple_calculate(s1 + s2);
            if(result.equals("不能除0")) {
                s1 = result;
            } else {
                s1 = s1 + s2 + "=" + result;
//               s1 = simple_calculate(s1 + s2);
            }
        }
        print1.setText(s1);
        print2.setText("0");
    }

    public String simple_calculate(String s) {
        int temp = 0;
        LinkedList<Node> linkedList = new LinkedList<Node>();
        LinkedList<String> arrayList = new LinkedList<String>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                Node node = new Node(1, 1, arrayList.size(), arrayList.size() + 1);
                String subString = s.substring(temp, i);
                arrayList.add(subString);
                linkedList.add(node);
                temp = i + 1;
            } else if (s.charAt(i) == '−') {
                Node node = new Node(2, 1, arrayList.size(), arrayList.size() + 1);
                String subString = s.substring(temp, i);
                arrayList.add(subString);
                linkedList.add(node);
                temp = i + 1;
            } else if (s.charAt(i) == '×') {
                Node node = new Node(3, 2, arrayList.size(), arrayList.size() + 1);
                String subString = s.substring(temp, i);
                arrayList.add(subString);
                linkedList.add(node);
                temp = i + 1;
            } else if (s.charAt(i) == '÷') {
                Node node = new Node(4, 2, arrayList.size(), arrayList.size() + 1);
                String subString = s.substring(temp, i);
                arrayList.add(subString);
                linkedList.add(node);
                temp = i + 1;
            } else if (i == s.length() - 1) {
                String subString = s.substring(temp, s.length());
                arrayList.add(subString);
            }
        }
        String s_num = "";
        Collections.sort(linkedList, new NodeCompare());
        for(int i = 0; i < linkedList.size(); i++) {
            Node item = linkedList.get(i);
            BigDecimal left_value = new BigDecimal(arrayList.get(item.left_index));
            BigDecimal right_value = new BigDecimal(arrayList.get(item.right_index));
            BigDecimal result = new BigDecimal("0");
            if(item.key == 1) {
                result = left_value.add(right_value);
//                result = result.setScale(4, BigDecimal.ROUND_HALF_UP);
            } else if(item.key == 2) {
                result = left_value.subtract(right_value);
//                result = result.setScale(4, BigDecimal.ROUND_HALF_UP);
            } else if(item.key == 3) {
                result = left_value.multiply(right_value);
//                result = result.setScale(4, BigDecimal.ROUND_HALF_UP);
            } else if(item.key == 4) {
                if(arrayList.get(item.right_index).equals("0"))
                    return "不能除0";
                 result = left_value.divide(right_value, BigDecimal.ROUND_HALF_UP);
//                result = result.setScale(4, BigDecimal.ROUND_HALF_UP);
            }
            arrayList.set(item.left_index, result.toString());
            arrayList.remove(item.right_index);
            adjustLink(item.left_index, linkedList);
        }
        return arrayList.get(0);
    }
    public void adjustLink(int index, LinkedList<Node> linkedList) {
        for (int i = 0;i < linkedList.size(); i++) {
            Node item = linkedList.get(i);
            if(item.left_index > index) {
                item.setLeft_index(item.left_index - 1);
            }
            if(item.right_index >index) {
                item.setRight_index(item.right_index - 1);
            }
            linkedList.set(i, item);
        }

    }
}
