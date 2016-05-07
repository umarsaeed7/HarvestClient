package com.harvestclient.exceptions;

public class HarvestClientException
        extends RuntimeException
{

    public HarvestClientException(String message)
    {
        super(message);
    }

    public HarvestClientException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

}
