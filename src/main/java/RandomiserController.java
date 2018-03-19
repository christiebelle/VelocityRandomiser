import spark.template.velocity.VelocityTemplateEngine;

import java.util.Collections;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandomiserController {

        public static void main(String[] args) {
            VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
            staticFileLocation("/public");

            get("/randomiser", (req,res)->{
                Collections.shuffle(names);
                return names.get(0);
            });


        }
    }
