/**
 * Copyright (c) 2008-2015, Massachusetts Institute of Technology (MIT)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package edu.mit.ll.nics.common.entity;

// Generated Sep 30, 2011 1:24:44 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Form generated by hbm2java
 */
@Entity
@Proxy(lazy=false)
@Table(name = "form")
@SequenceGenerator(
	name="SEQ_STORE",
	sequenceName="form_seq",
	allocationSize=1
)
public class Form extends SADisplayMessageEntity implements SADisplayPersistedEntity {

	private int formid;
	private Incident incident;
	private int incidentid;
	private String incidentname;
	private FormType formtype;
	private int formtypeid;
	private Usersession usersession;
	private int usersessionid;
	private long seqtime;
	private long seqnum;
	private String message;
	private Boolean distributed;
	private int senderuserid;

	public Form() {
	}

	public Form(int formid, Incident incident, FormType formtype,
			Usersession usersession, long seqtime, long seqnum, String message) {
		this.formid = formid;
		this.incident = incident;
		this.formtype = formtype;
		this.usersession = usersession;
		this.seqtime = seqtime;
		this.seqnum = seqnum;
		this.message = message;
	}

	public Form(int formid, Incident incident, FormType formtype,
			Usersession usersession, long seqtime, int seqnum, String message,
			Boolean distributed, int senderuserid) {
		this.formid = formid;
		this.incident = incident;
		this.formtype = formtype;
		this.usersession = usersession;
		this.seqtime = seqtime;
		this.seqnum = seqnum;
		this.message = message;
		this.distributed = distributed;
		this.senderuserid = senderuserid;
	}

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_STORE")
	@Column(name = "formid", unique = true, nullable = false)
	public int getFormId() {
		return this.formid;
	}

	public void setFormId(int formid) {
		this.formid = formid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incidentid", insertable=false, updatable = false)
	public Incident getIncident() {
		return this.incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}
	
	@Column(name = "incidentid", nullable = false)
	public int getIncidentid(){
		return this.incidentid;
	}
	
	public void setIncidentid(int incidentid){
		this.incidentid = incidentid;
	}
	
	public String getIncidentname(){
		return this.incidentname;
	}
	
	public void setIncidentname(String incidentname){
		this.incidentname = incidentname;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "formtypeid", insertable=false, updatable = false)
	public FormType getFormtype() {
		return this.formtype;
	}

	public void setFormtype(FormType formtype) {
		this.formtype = formtype;
	}
	
	@Column(name = "formtypeid", nullable = false)
	public int getFormtypeid(){
		return this.formtypeid;
	}
	
	public void setFormtypeid(int formtypeid){
		this.formtypeid = formtypeid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usersessionid", insertable=false, updatable = false)
	public Usersession getUsersession() {
		return this.usersession;
	}

	public void setUsersession(Usersession usersession) {
		this.usersession = usersession;
	}
	
	@Column(name = "usersessionid", nullable = false)
	public int getUsersessionid(){
		return this.usersessionid;
	}
	
	public void setUsersessionid(int usersessionid){
		this.usersessionid = usersessionid;
	}

	@Column(name = "seqtime", nullable = false)
	public long getSeqtime() {
		return this.seqtime;
	}

	public void setSeqtime(long seqtime) {
		this.seqtime = seqtime;
	}

	@Column(name = "seqnum", nullable = false)
	public long getSeqnum() {
		return this.seqnum;
	}

	public void setSeqnum(long seqnum) {
		this.seqnum = seqnum;
	}

	@Column(name = "message", nullable = false)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = encodeJSONObject(message);
	}

	@Column(name = "distributed")
	public Boolean getDistributed() {
		return this.distributed;
	}

	public void setDistributed(Boolean distributed) {
		this.distributed = distributed;
	}

	public JSONObject toJSONObject(){
		try{
			JSONObject object = new JSONObject();
			object.put("formid", this.formid);
			object.put("usersessionid", this.usersessionid);
			object.put("incidentid", this.incidentid);
			object.put("incidentname", this.incidentname);
			object.put("formtypeid", this.formtypeid);
			object.put("seqtime", this.seqtime);
			object.put("seqnum", this.seqnum);
			object.put("message", this.message);
			object.put("distributed", this.distributed);
			return object;
		}catch(JSONException e){}
		return null;
	}
}
