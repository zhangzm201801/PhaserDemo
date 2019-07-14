package com.zzm.phaser;

public class Test {

	public static void main(String[] args) {
		MyPhaser phaser = new MyPhaser();
		for (int i = 0; i < 3; i++) {
			CompetitionTeam target = new CompetitionTeam(phaser);
			phaser.register();
			new Thread(target).start();

		}
	}
}
