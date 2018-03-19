import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomiserController {

    private static ArrayList<Name> names;

    public static void main(String[] args) {
            VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
            staticFileLocation("/public");

            get("/randomiser", (req,res)->{
                HashMap<String, Object> model = new HashMap<>();
                Collections.shuffle(names);

                model.put("names", names.get(0));
                model.put("template", "names.vtl");
                return new ModelAndView(model, "layout.vtl");
            }, velocityTemplateEngine);
        }
    }
