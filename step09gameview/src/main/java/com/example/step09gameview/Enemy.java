package com.example.step09gameview;

public class Enemy {
    public int x,y;
    public int type;
    public boolean isDead = false;
    public int energy;
    public int imageIndex;
    public boolean isFall; //현재 추락 여부
    public int angle; //현재 회전 각
    public int size; // 현재 크기
}
