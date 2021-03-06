/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#query(QueryRequest) Query operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#query(QueryRequest)
 */
public class QueryRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String tableName;

    private String indexName;

    private String select;

    private java.util.List<String> attributesToGet;

    private Integer limit;

    private Boolean consistentRead;

    private java.util.Map<String,Condition> keyConditions;

    private Boolean scanIndexForward;

    private java.util.Map<String,AttributeValue> exclusiveStartKey;

    private String returnConsumedCapacity;

    /**
     * Returns the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the TableName property for this object.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * Returns the value of the IndexName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the IndexName property for this object.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * Sets the value of the IndexName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The new value for the IndexName property for this object.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * Sets the value of the IndexName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The new value for the IndexName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }
    
    
    /**
     * Returns the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @return The value of the Select property for this object.
     *
     * @see Select
     */
    public String getSelect() {
        return select;
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @see Select
     */
    public void setSelect(String select) {
        this.select = select;
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Select
     */
    public QueryRequest withSelect(String select) {
        this.select = select;
        return this;
    }
    
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @see Select
     */
    public void setSelect(Select select) {
        this.select = select.toString();
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Select
     */
    public QueryRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }
    
    /**
     * Returns the value of the AttributesToGet property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the AttributesToGet property for this object.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the Limit property for this object.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    
    /**
     * Returns the value of the ConsistentRead property for this object.
     *
     * @return The value of the ConsistentRead property for this object.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Sets the value of the ConsistentRead property for this object.
     *
     * @param consistentRead The new value for the ConsistentRead property for this object.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * Sets the value of the ConsistentRead property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead The new value for the ConsistentRead property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * Returns the value of the ConsistentRead property for this object.
     *
     * @return The value of the ConsistentRead property for this object.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Returns the value of the KeyConditions property for this object.
     *
     * @return The value of the KeyConditions property for this object.
     */
    public java.util.Map<String,Condition> getKeyConditions() {
        
        return keyConditions;

    }
    
    /**
     * Sets the value of the KeyConditions property for this object.
     *
     * @param keyConditions The new value for the KeyConditions property for this object.
     */
    public void setKeyConditions(java.util.Map<String,Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }
    
    /**
     * Sets the value of the KeyConditions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyConditions The new value for the KeyConditions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withKeyConditions(java.util.Map<String,Condition> keyConditions) {
        setKeyConditions(keyConditions);
        return this;
    }
    
    /**
     * Returns the value of the ScanIndexForward property for this object.
     *
     * @return The value of the ScanIndexForward property for this object.
     */
    public Boolean isScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * Sets the value of the ScanIndexForward property for this object.
     *
     * @param scanIndexForward The new value for the ScanIndexForward property for this object.
     */
    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }
    
    /**
     * Sets the value of the ScanIndexForward property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanIndexForward The new value for the ScanIndexForward property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }
    
    
    /**
     * Returns the value of the ScanIndexForward property for this object.
     *
     * @return The value of the ScanIndexForward property for this object.
     */
    public Boolean getScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * Returns the value of the ExclusiveStartKey property for this object.
     *
     * @return The value of the ExclusiveStartKey property for this object.
     */
    public java.util.Map<String,AttributeValue> getExclusiveStartKey() {
        
        return exclusiveStartKey;

    }
    
    /**
     * Sets the value of the ExclusiveStartKey property for this object.
     *
     * @param exclusiveStartKey The new value for the ExclusiveStartKey property for this object.
     */
    public void setExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * Sets the value of the ExclusiveStartKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey The new value for the ExclusiveStartKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }
    
    /**
     * Returns the value of the ReturnConsumedCapacity property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return The value of the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public QueryRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }
    
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public QueryRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");    	
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");    	
        if (getSelect() != null) sb.append("Select: " + getSelect() + ",");    	
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");    	
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");    	
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() + ",");    	
        if (getKeyConditions() != null) sb.append("KeyConditions: " + getKeyConditions() + ",");    	
        if (isScanIndexForward() != null) sb.append("ScanIndexForward: " + isScanIndexForward() + ",");    	
        if (getExclusiveStartKey() != null) sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((getKeyConditions() == null) ? 0 : getKeyConditions().hashCode()); 
        hashCode = prime * hashCode + ((isScanIndexForward() == null) ? 0 : isScanIndexForward().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof QueryRequest == false) return false;
        QueryRequest other = (QueryRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getSelect() == null ^ this.getSelect() == null) return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.getKeyConditions() == null ^ this.getKeyConditions() == null) return false;
        if (other.getKeyConditions() != null && other.getKeyConditions().equals(this.getKeyConditions()) == false) return false; 
        if (other.isScanIndexForward() == null ^ this.isScanIndexForward() == null) return false;
        if (other.isScanIndexForward() != null && other.isScanIndexForward().equals(this.isScanIndexForward()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    