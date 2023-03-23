package com.miramontes.hoteldemorest.client;

import com.miramontes.hoteldemorest.client.generated.*;
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

    public Response delete(Integer id) {
        DeleteRequest request = new DeleteRequest();
        request.setId(id);

        return (Response) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ResponseHotel update(Hotel hotel) {
        UpdateRequest request = new UpdateRequest();
        request.setHotel(hotel);

        return (ResponseHotel) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
