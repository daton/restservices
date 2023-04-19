package educarvr.restservices.service;

import java.util.Collection;


import educarvr.restservices.domain.Member;

/**
 * Created by marten on 16-06-14.
 */
public interface MemberService {

    Collection<Member> findAll();
    Member find(long id);
}
