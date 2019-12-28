package pi.individual;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Container lonelyMethod(
            @RequestParam(value = "year") Integer year
    ) {
        try {
            if (year < 0 || year > 9999)
                throw new NumberFormatException();
            else if (isLeapYear(year))
                return new Container(200, "12/09/" + String.format("%04d", year));
            else return new Container(200, "13/09/" + String.format("%04d", year));
        } catch (NumberFormatException e) {
            return new Container(400, "Неверный формат даты");
        }
    }

    private boolean isLeapYear(Integer year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}