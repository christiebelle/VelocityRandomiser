import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomiserController {

        public static void main(String[] args) {
            VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
            staticFileLocation("/public");

            get("/one", (req, res) -> {}, velocityTemplateEngine);

        }
    }
}
