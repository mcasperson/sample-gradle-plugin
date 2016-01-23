package com.matthewcasperson.plugin.services.impl

import com.matthewcasperson.plugin.services.ConfigureMaven
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
trait SharedConfigureMaven implements ConfigureMaven {
    void configureMaven(Project project) {
        assert project != null;
        project.repositories.maven {
            url 'http://internalmavenrepo';
        }
    }
}