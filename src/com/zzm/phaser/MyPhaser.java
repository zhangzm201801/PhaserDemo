package com.zzm.phaser;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {

	@Override
	protected boolean onAdvance(int phase, int registeredParties) {
		switch (phase) {
		case 0:
			return competionTeamArrived();
		case 1:
			return finishCompetition1();
		case 2:
			return finishCompetition2();
		case 3:
			return finishFinal();
		default:
			return true;
		}
	}

	private boolean competionTeamArrived() {
		System.out.println("比赛队伍到齐,参赛队数：" + getRegisteredParties());
		return false;
	}

	private boolean finishCompetition1() {
		System.out.println("初赛进行完毕");
		return false;
	}

	private boolean finishCompetition2() {
		System.out.println("复赛进行完毕");
		return false;
	}

	private boolean finishFinal() {
		System.out.println("决赛进行完毕，结束比赛");
		return true;
	}
}
