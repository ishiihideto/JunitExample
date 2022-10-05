package exercise3_1;
public class WeatherForecast {
	public static boolean check(int rainyPercent) throws RainyException {
		boolean bringUmbrella = false;		//傘を持って行かない
		if(rainyPercent >= 0 && rainyPercent <= 100) {
			if(rainyPercent >= 40) {			//降水確率40％以上の場合
				bringUmbrella = true;			//傘を持って行く
				System.out.println("傘を必ず持って行ってください");
			}
		} else {
			throw new RainyException("降水確率が無効な値です");
		}
		return bringUmbrella;
	}
}