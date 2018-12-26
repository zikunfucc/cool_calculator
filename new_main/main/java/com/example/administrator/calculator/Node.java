package com.example.administrator.calculator;

import java.util.Comparator;

public class Node {
    public int value;   // 优先级
    public int key;     // 加减乘除
    public int left_index;      // 左边数字的索引
    public int right_index;     // 右边数字的索引
    public Node() {
        key = 0;
        value = 0;
        left_index = 0;
        right_index = 0;
    }
    public Node(int Key, int Value, int Left_index, int Right_index) {
        key = Key;
        value = Value;
        left_index = Left_index;
        right_index = Right_index;
    }

    public void setLeft_index(int left_index) {
        this.left_index = left_index;
    }

    public void setRight_index(int right_index) {
        this.right_index = right_index;
    }
}

// 继承Comparator接口，重写自定义compare方法
class NodeCompare implements Comparator<Node> {
    @Override
    public int compare(Node n1, Node n2) {
        if(n1.value > n2.value) {
            return -1;
        } else if(n1.value < n2.value) {
            return 1;
        }
        return 0;
    }
}
