package bloodbank.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-07-29T12:21:07.525-0400")
@StaticMetamodel(SecurityRole.class)
public class SecurityRole_ extends PojoBase_ {
	public static volatile SingularAttribute<SecurityRole, String> roleName;
	public static volatile SetAttribute<SecurityRole, SecurityUser> users;
	public static volatile SingularAttribute<SecurityRole, Integer> id;
}
