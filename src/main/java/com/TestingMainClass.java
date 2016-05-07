package com;

import com.harvestclient.HarvestClient;
import com.harvestclient.HarvestClientFactory;
import com.harvestclient.models.Project;
import com.harvestclient.models.ProjectCollection;
import com.harvestclient.models.Task;
import com.harvestclient.models.TaskCollection;
import com.harvestclient.models.User;
import com.harvestclient.models.UserCollection;

public class TestingMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HarvestClientFactory factory = new HarvestClientFactory();
        HarvestClient client = factory.create("subdomain", "username", "password");
        UserCollection users = client.getUsers();

        for (User user : users) {
            System.out.println("User Name:" + user.getFirstName());
        }

        ProjectCollection projects = client.getProjects();

        for (Project project : projects) {
            System.out.println("Project Name:" + project.getName());
        }

        TaskCollection tasks = client.getTasks();

        for (Task task : tasks) {
            System.out.println("Task Name:" + task.getName());
        }
    }

}
