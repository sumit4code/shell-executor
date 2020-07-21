package com.learning.tutorial.shell.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecutionPoint {

    public static final Logger LOGGER = LoggerFactory.getLogger(ExecutionPoint.class);

    public static void main(String[] args) {
        LOGGER.info("Execution point started");
        ScriptExecutor scriptExecutor = new ScriptExecutor();
        scriptExecutor.executeScript();
    }

}
