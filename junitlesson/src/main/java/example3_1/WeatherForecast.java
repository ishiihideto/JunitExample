package example3_1;
public class WeatherForecast {
	public static boolean check(int rainyPercent) {
		boolean bringUmbrella;
		if(rainyPercent >= 40) {		//降水確率40％以上の場合
			bringUmbrella = true;		//傘を持って行く
		} else {
			bringUmbrella = false;		//傘を持って行かない
		}
		return bringUmbrella;
	}
}