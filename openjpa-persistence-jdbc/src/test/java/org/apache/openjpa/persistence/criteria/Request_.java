/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import java.sql.Date;

import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openjpa.persistence.criteria.Request.class)
public class Request_ {
    public static volatile SingularAttribute<Request,Short> status;
    public static volatile SingularAttribute<Request,Integer> id;
    public static volatile SingularAttribute<Request,Account> account;
    public static volatile SingularAttribute<Request,Date> requestTime;
}
