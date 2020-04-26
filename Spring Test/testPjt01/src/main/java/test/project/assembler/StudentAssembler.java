package test.project.assembler;

import test.project.dao.StudentDAO;
import test.project.service.StudentAllSelectService;
import test.project.service.StudentDeleteService;
import test.project.service.StudentModifyService;
import test.project.service.StudentRegisterService;
import test.project.service.StudentSelectService;

public class StudentAssembler {
	private StudentDAO studentDAO;
	private StudentRegisterService registerService;
	private StudentModifyService modifyService;
	private StudentDeleteService deleteService;
	private StudentSelectService selectService;
	private StudentAllSelectService allSelectService;
	
	public StudentAssembler() {
		studentDAO = new StudentDAO();
		registerService = new StudentRegisterService(studentDAO);
		modifyService = new StudentModifyService(studentDAO);
		deleteService = new StudentDeleteService(studentDAO);
		selectService = new StudentSelectService(studentDAO);
		allSelectService = new StudentAllSelectService(studentDAO);
	}

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	public StudentRegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(StudentRegisterService registerService) {
		this.registerService = registerService;
	}
	public StudentModifyService getModifyService() {
		return modifyService;
	}
	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}
	public StudentDeleteService getDeleteService() {
		return deleteService;
	}
	public void setDeleteService(StudentDeleteService deleteService) {
		this.deleteService = deleteService;
	}
	public StudentSelectService getSelectService() {
		return selectService;
	}
	public void setSelectService(StudentSelectService selectService) {
		this.selectService = selectService;
	}
	public StudentAllSelectService getAllSelectService() {
		return allSelectService;
	}
	public void setAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}
}