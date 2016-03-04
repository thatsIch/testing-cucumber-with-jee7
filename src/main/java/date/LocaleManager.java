package date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.ejb.Stateless;


@Stateless
public class LocaleManager {
	public DateFormat getSpecialDateFormat() {
		return new SimpleDateFormat("EEE, MMM d, yyyy");
	}
}
