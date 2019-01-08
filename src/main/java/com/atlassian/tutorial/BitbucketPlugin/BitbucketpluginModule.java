package com.atlassian.tutorial.BitbucketPlugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
//import com.atlassian.webresource.api.assembler.PageBuilderService;
//import javax.inject.Inject;

public class BitbucketpluginModule extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(BitbucketpluginModule.class);

//    @Inject
//    private PageBuilderService pageBuilderService;



    @Override
    public String execute() throws Exception {
      //  pageBuilderService.assembler().resources().requireWebResource("")

        return "Bitbucket-Plugin-Success"; //returns SUCCESS
    }

    /*public void setPageBuilderService(PageBuilderService pageBuilderService) {
        this.pageBuilderService = pageBuilderService;
    }*/
}
