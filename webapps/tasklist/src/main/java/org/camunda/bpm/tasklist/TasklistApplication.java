package org.camunda.bpm.tasklist;

import org.camunda.bpm.engine.rest.mapper.JacksonConfigurator;
import org.camunda.bpm.tasklist.resources.AuthenticationResource;
import org.camunda.bpm.tasklist.resources.TaskFormResource;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author drobisch
 */
public class TasklistApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();

    classes.add(AuthenticationResource.class);
    classes.add(TaskFormResource.class);

    classes.add(JacksonConfigurator.class);
    classes.add(JacksonJsonProvider.class);

    return classes;
  }

}