package com.harvestclient.exceptions;

public class ThrottleLimitReachedException
        extends HarvestClientException
{
    public ThrottleLimitReachedException()
    {
        super("The Harvest API throttle limit is reached.");
    }
}
