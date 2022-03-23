package com.geekbrains;

public class Wall extends Barrier{
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    protected boolean moving(Actions actions){
        System.out.println("the wall " + super.getName() + " height: " + this.height);
        actions.jump();

        if(getHeight() <= actions.getJumpHeight()){
            System.out.println("jump success");
            return true;
        } else {
            System.out.println("jump unsuccessfully");
            return false;
        }
    }
}
