package com.zzm.phaser;

/*
 * ��������
 */
public class CompetitionTeam implements Runnable {

	MyPhaser phaser = new MyPhaser();

	public CompetitionTeam(MyPhaser myPhaser) {
		this.phaser = myPhaser;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "���ﳡ��");
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "��ʼ���г���...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "��ʼ���и���...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "��ʼ���о���...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

	}

}
