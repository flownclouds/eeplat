package com.exedosoft.plat.action.customize.tools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.exedosoft.plat.action.DOAbstractAction;
import com.exedosoft.plat.bo.DOBO;
import com.exedosoft.plat.gene.jquery.AProjectForwarderJquery;

public class DOGeneConfigApplication extends DOAbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123234L;

	private static Log log = LogFactory.getLog(DOGeneConfigApplication.class);

	/**
	 * Save �����������Parameter ȡֵʱ������auto_condition����ѯ�� �����
	 */

	public String excute() {
		
		DOBO bo = DOBO.getDOBOByName("do_application");
		String applicationUid = bo.getCorrInstance().getUid();
		if(applicationUid==null){
			this.setEchoValue("û���ҵ���Ҫ��ʼ����Ӧ��!");
			return NO_FORWARD;
		}

		AProjectForwarderJquery  af = new AProjectForwarderJquery();
		af.forwardBaseUI(applicationUid);
		this.setEchoValue("��ʼ���ɹ�!");
		return DEFAULT_FORWARD;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}