package io.bymbl.aws.lambda.poc;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * @author Lars
 * @since 1-8-2016
 */
public class HelloLambda {

    public String myHandler(String name, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received : " + name);
        return "Hello " + name;
    }

}