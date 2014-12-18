package org.cloudfoundry.community.servicebroker.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * A binding to a service instance
 * 
 * @author sgreenberg@gopivotal.com
 *
 */
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ServiceInstanceBinding {

	@JsonSerialize
	@JsonProperty("service_instance_binding_id")
	private String id;

	@JsonSerialize
	@JsonProperty("service_instance_id")
	private String serviceInstanceId;

	@JsonSerialize
	@JsonProperty("credentials")
	private Map<String, Object> credentials = new HashMap<String, Object>();

	@JsonSerialize
	@JsonProperty("syslog_drain_url")
	private String syslogDrainUrl;

	@JsonSerialize
	@JsonProperty("app_guid")
	private String appGuid;

	@SuppressWarnings("unused")
	private ServiceInstanceBinding() {
	}

	public ServiceInstanceBinding(String id, 
			String serviceInstanceId, 
			Map<String,Object> credentials,
			String syslogDrainUrl, String appGuid) {
		setId(id);
		setServiceInstanceId(serviceInstanceId);
		setCredentials(credentials);
		setSyslogDrainUrl(syslogDrainUrl);
		setAppGuid(appGuid);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getServiceInstanceId() {
		return serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}

	public Map<String, Object> getCredentials() {
		return credentials;
	}

	private void setCredentials(Map<String, Object> credentials) {
		if (credentials == null) {
			credentials = new HashMap<String, Object>();
		} else {
			this.credentials = credentials;
		}
	}

	public String getSyslogDrainUrl() {
		return syslogDrainUrl;
	}

	public void setSyslogDrainUrl(String syslogDrainUrl) {
		this.syslogDrainUrl = syslogDrainUrl;
	}

	public String getAppGuid() {
		return appGuid;
	}

	public void setAppGuid(String appGuid) {
		this.appGuid = appGuid;
	}

}
