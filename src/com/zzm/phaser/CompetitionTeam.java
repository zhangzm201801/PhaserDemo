package com.zzm.phaser;

/*
 * 参赛队伍
 */
public class CompetitionTeam implements Runnable {

	MyPhaser phaser = new MyPhaser();

	public CompetitionTeam(MyPhaser myPhaser) {
		this.phaser = myPhaser;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "到达场地");
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "开始进行初赛...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "开始进行复赛...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

		System.out.println(Thread.currentThread().getName() + "开始进行决赛...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		phaser.arriveAndAwaitAdvance();

	}

}
