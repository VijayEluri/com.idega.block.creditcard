package com.idega.block.creditcard.data;

import com.idega.util.IWTimestamp;


public class KortathjonustanAuthorisationEntriesHomeImpl extends com.idega.data.IDOFactory implements KortathjonustanAuthorisationEntriesHome
{
 protected Class getEntityInterfaceClass(){
  return KortathjonustanAuthorisationEntries.class;
 }


 public KortathjonustanAuthorisationEntries create() throws javax.ejb.CreateException{
  return (KortathjonustanAuthorisationEntries) super.createIDO();
 }


public KortathjonustanAuthorisationEntries findByAuthorizationCode(java.lang.String p0, IWTimestamp stamp)throws javax.ejb.FinderException{
	com.idega.data.IDOEntity entity = this.idoCheckOutPooledEntity();
	Object pk = ((KortathjonustanAuthorisationEntriesBMPBean)entity).ejbFindByAuthorizationCode(p0, stamp);
	this.idoCheckInPooledEntity(entity);
	return this.findByPrimaryKey(pk);
}

 public KortathjonustanAuthorisationEntries findByPrimaryKey(Object pk) throws javax.ejb.FinderException{
  return (KortathjonustanAuthorisationEntries) super.findByPrimaryKeyIDO(pk);
 }



}