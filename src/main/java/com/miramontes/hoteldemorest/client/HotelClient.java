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

    public ResponseHotelList getAllByNameLike(String name) {
        GetHotelListByNameLikeRequest request = new GetHotelListByNameLikeRequest();
        request.setName(name);

        return (ResponseHotelList) getWebServiceTemplate().marshalSendAndReceive(request);
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

    public ResponseHotel create(CreateHotelRequest request) {
        return (ResponseHotel) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ResponseHotel updateAmenitiesById(UpdateAmenitiesHotelLinkByIdRequest request) {
        return (ResponseHotel) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public ResponseHotel updateAmenitiesByName(UpdateAmenitiesHotelLinkByNameRequest request) {
        return (ResponseHotel) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
