package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextTarget implements Question<String> {

    private Target field;
    public TextTarget(Target field) {
        this.field = field;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(field).viewedBy(actor).asString();
    }

    public static TextTarget textTarget(Target field) {
        return new TextTarget(field);
    }

}
