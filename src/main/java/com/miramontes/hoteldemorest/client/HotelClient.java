package com.miramontes.hoteldemorest.client;

import com.miramontes.hoteldemorest.client.generated.GetByIdRequest;
import com.miramontes.hoteldemorest.client.generated.GetHotelListRequest;
import com.miramontes.hoteldemorest.client.generated.ResponseHotel;
import com.miramontes.hoteldemorest.client.generated.ResponseHotelList;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class HotelClient extends WebServiceGatewaySupport {

    public ResponseHotel getById(int id) {
        GetByIdRequest request = new GetByIdRequest();
        request.setId(id);

        return (ResponseHotel) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ResponseHotelList getAll() {
        return (ResponseHotelList)
                getWebServiceTemplate().marshalSendAndReceive(new GetHotelListRequest());
    }
}
