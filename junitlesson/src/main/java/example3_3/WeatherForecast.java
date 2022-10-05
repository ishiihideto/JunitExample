package example3_3;
public class WeatherForecast {
	public static boolean check(int rainyPercent) throws RainyException {
		boolean bringUmbrella = false;		//傘を持って行かない
		if(rainyPercent < 0 || rainyPercent > 100) {
			throw new RainyException("降水確率が無効な値です");
		}
		if(rainyPercent >= 40) {				//降水確率40％以上の場合
			bringUmbrella = true;				//傘を持って行く
			if(rainyPercent <= 80) {
				System.out.println("傘の置き忘れに注意してください");
			}
		}
		return bringUmbrella;
	}
}