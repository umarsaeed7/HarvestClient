package com.harvestclient.exceptions;

public class MissingParameterException
        extends HarvestClientException
{
    public MissingParameterException(String paramName)
    {
        super("A required parameter is missing: " + paramName);
    }
}
