package cn.doodlister.onlinejudge;

public class TestSync implements  Runnable {
    int b =100;
    synchronized void m1() throws InterruptedException {
        b = 1000;

        Thread.sleep(500);
        System.out.println("b="+b);
    }
    synchronized void m2() throws InterruptedException {
        Thread.sleep(250);

        b = 2000;
       // System.out.println("m2 b :"+b);

    }

    public static void main(String[] args) throws InterruptedException {

        TestSync tt = new TestSync();
        Thread t =new Thread(tt);
        t.start();
        Thread.sleep(1000);
        tt.m2();

        System.out.println("main thread b :"+tt.b);
    }
    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
