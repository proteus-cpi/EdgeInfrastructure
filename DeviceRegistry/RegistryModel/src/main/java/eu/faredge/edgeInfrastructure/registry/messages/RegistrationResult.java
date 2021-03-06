package eu.faredge.edgeInfrastructure.registry.messages;

/**
 * This class is used as a response by the FAR-EDGE
 * Registration Service
 * 
 * @author amoral@sensap.eu
 *
 */
public class RegistrationResult 
{
	private RegistrationResultStatusEnum status;
	private String statusMessage;
	private String body;
	
	public RegistrationResultStatusEnum getStatus() {
		return status;
	}
	
	public void setStatus(RegistrationResultStatusEnum status) {
		this.status = status;
	}
	
	public String getStatusMessage() {
		return statusMessage;
	}
	
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	
}
