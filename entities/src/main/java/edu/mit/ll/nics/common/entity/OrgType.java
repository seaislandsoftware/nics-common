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

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Orgtype generated by hbm2java
 */
@Entity
@Proxy(lazy=false)
@Table(name = "orgtype")
public class OrgType implements SADisplayPersistedEntity {

	private int orgtypeid;
	private String orgtypename;
	private Set<OrgOrgType> orgOrgtypes = new HashSet<OrgOrgType>(0);

	public OrgType() {
	}

	public OrgType(int orgtypeid, String orgtypename) {
		this.orgtypeid = orgtypeid;
		this.orgtypename = orgtypename;
	}

	public OrgType(int orgtypeid, String orgtypename,
			Set<OrgOrgType> orgOrgtypes) {
		this.orgtypeid = orgtypeid;
		this.orgtypename = orgtypename;
		this.orgOrgtypes = orgOrgtypes;
	}

	@Id
	@Column(name = "orgtypeid", unique = true, nullable = false)
	public int getOrgTypeId() {
		return this.orgtypeid;
	}

	public void setOrgTypeId(int orgtypeid) {
		this.orgtypeid = orgtypeid;
	}

	@Column(name = "orgtypename", nullable = false, length = 45)
	public String getOrgTypeName() {
		return this.orgtypename;
	}

	public void setOrgTypeName(String orgtypename) {
		this.orgtypename = orgtypename;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orgtype")
	public Set<OrgOrgType> getOrgOrgTypes() {
		return this.orgOrgtypes;
	}

	public void setOrgOrgTypes(Set<OrgOrgType> orgOrgtypes) {
		this.orgOrgtypes = orgOrgtypes;
	}

}
