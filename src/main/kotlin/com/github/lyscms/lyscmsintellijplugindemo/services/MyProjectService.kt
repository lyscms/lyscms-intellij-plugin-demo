package com.github.lyscms.lyscmsintellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.lyscms.lyscmsintellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
