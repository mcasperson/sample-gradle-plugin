package com.matthewcasperson.plugin.services.impl

import com.matthewcasperson.plugin.services.ConfigureSonarQube
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
trait SharedConfigureSonarQube implements ConfigureSonarQube {
    void configureSonarQube(Project project) {
        assert project != null;
        project.sonarRunner {
            sonarProperties {
                property "sonar.host.url", "http://my.server.com"
                property "sonar.jdbc.url", "jdbc:mysql://my.server.com/sonar"
                property "sonar.jdbc.driverClassName", "com.mysql.jdbc.Driver"
                property "sonar.jdbc.username", "Fred Flintstone"
                property "sonar.jdbc.password", "very clever"
            }
        }
    }
}