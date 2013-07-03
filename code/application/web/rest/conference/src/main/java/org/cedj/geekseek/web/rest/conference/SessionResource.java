package org.cedj.geekseek.web.rest.conference;

import javax.ws.rs.Path;

import org.cedj.geekseek.domain.conference.model.Session;
import org.cedj.geekseek.web.rest.conference.model.SessionRepresentation;
import org.cedj.geekseek.web.rest.core.RepositoryResource;
import org.cedj.geekseek.web.rest.core.Resource;

@Path("/session")
public class SessionResource extends RepositoryResource<Session, SessionRepresentation> {

    private static final String SESSION_XML_MEDIA_TYPE = BASE_XML_MEDIA_TYPE + "; type=session";
    private static final String SESSION_JSON_MEDIA_TYPE = BASE_JSON_MEDIA_TYPE + "; type=session";

    @Override
    public Class<? extends Resource> getResourceClass() {
        return SessionResource.class;
    }

    @Override
    public String getResourceMediaType() {
        return SESSION_XML_MEDIA_TYPE;
    }

    @Override
    protected String[] getMediaTypes() {
        return new String[] {SESSION_XML_MEDIA_TYPE, SESSION_JSON_MEDIA_TYPE};
    }
}