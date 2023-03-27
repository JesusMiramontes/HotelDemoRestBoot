package com.miramontes.hoteldemorest.client;

import com.miramontes.hoteldemorest.client.generated.GetAmenitiesListRequest;
import com.miramontes.hoteldemorest.client.generated.ResponseAmenitiesList;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AmenityClient extends WebServiceGatewaySupport {
    public ResponseAmenitiesList getAmenitiesList() {
        return (ResponseAmenitiesList)
                getWebServiceTemplate().marshalSendAndReceive(new GetAmenitiesListRequest());
    }
}
