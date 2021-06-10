package com.Shildt_3;

public class BlockPassDemo {
    public static void main(String[] args) {
        Block ob1=new Block(10,2,5);
        Block ob2=new Block(10,2,5);
        Block ob3=new Block(4,5,5);

        System.out.println("объект 1 имеет те же размеры, что и объект 2? Ответ: "+ob1.sameBlock(ob2));
        System.out.println("объект 1 имеет те же размеры, что и объект 3? Ответ: "+ob1.sameBlock(ob3));
        System.out.println("объект 1 имеет тот же объем, что и объект 2? Ответ: "+ob1.sameVolume(ob2));
        System.out.println("объект 1 имеет тот же объем, что и объект 3? Ответ: "+ob1.sameVolume(ob3));
    }
}
