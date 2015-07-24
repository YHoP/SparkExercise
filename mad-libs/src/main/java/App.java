import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/form", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/story", (request, response) -> {
      HashMap model = new HashMap();

      model.put("verb_ing1", request.queryParams("verb_ing1"));
      model.put("verb_ing2", request.queryParams("verb_ing2"));
      model.put("verb_ed", request.queryParams("verb_ed"));
      model.put("place", request.queryParams("place"));
      model.put("verb1", request.queryParams("verb1"));
      model.put("verb2", request.queryParams("verb2"));

      model.put("template", "templates/story.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}