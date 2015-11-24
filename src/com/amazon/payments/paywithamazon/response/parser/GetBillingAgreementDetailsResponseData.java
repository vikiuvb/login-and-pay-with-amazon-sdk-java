package com.amazon.payments.paywithamazon.response.parser;

import com.amazon.payments.paywithamazon.response.model.BillingAgreementDetails;
import com.amazon.payments.paywithamazon.response.model.GetBillingAgreementDetailsResponse;
import java.io.Serializable;

/**
 * Response from GetBillingAgreementDetails service API, as returned by Amazon Payments
 */
public final class GetBillingAgreementDetailsResponseData  extends ResponseData implements Serializable{
    
    private String requestId;
    private BillingAgreementDetails billingAgreementDetails;
    
    public GetBillingAgreementDetailsResponseData(GetBillingAgreementDetailsResponse response , ResponseData rawResponse) {
        super(rawResponse);
        if(response != null) {
            this.requestId = response.getResponseMetadata().getRequestId();
            if(response.getGetBillingAgreementDetailsResult() != null) { 
               billingAgreementDetails = response.getGetBillingAgreementDetailsResult().getBillingAgreementDetails();
            }
        }
    }

    /**
     * The requestID that uniquely identifies the service request
     * the caller made.
     * 
     * @return  The requestID that uniquely identifies the service request
     * the caller made.
     */
    public String getRequestId() {
        return requestId;
    }


    /**
     * Encapsulates details about a Billing Agreement object and its current state.
     * Documentation: https://payments.amazon.com/documentation/apireference/201751630#201752500
     * 
     * @return billingAgreementDetails
     */
    public BillingAgreementDetails getDetails() {
        return billingAgreementDetails;
    }

    /**
     * Returns the string representation GetBillingAgreementDetailsResponseData
     */
    @Override
    public String toString() {
        return "GetBillingAgreementDetailsResponseData{" + "requestId=" + requestId + ", billingAgreementDetails=" + billingAgreementDetails.toString() + '}';
    }
    
    
    

}