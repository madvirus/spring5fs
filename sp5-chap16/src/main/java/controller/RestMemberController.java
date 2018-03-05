package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import spring.Member;
import spring.MemberDao;
import spring.MemberNotFoundException;

@RestController
public class RestMemberController {
	private MemberDao memberDao;
	//private MemberRegisterService registerService;

	@GetMapping("/api/members")
	public List<Member> members() {
		return memberDao.selectAll();
	}

	@GetMapping("/api/members/{id}")
	public Member member(@PathVariable Long id) {
		Member member = memberDao.selectById(id);
		if (member == null) {
			throw new MemberNotFoundException();
		}
		return member;
	}

//	@PostMapping("/api/members")
//	public ResponseEntity<Object> newMember(@RequestBody @Valid RegisterRequest regReq) {
//		try {
//			Long newMemberId = registerService.regist(regReq);
//			URI uri = UriComponentsBuilder.fromPath("/api/members/{id}").buildAndExpand(newMemberId).toUri();
//			return ResponseEntity.created(uri).build();
//		} catch (DuplicateMemberException dupEx) {
//			return ResponseEntity.notFound().build();
//		}
//	}
//
//	@PostMapping("/api/members2")
//	public void newMember(@RequestBody @Valid RegisterRequest regReq, HttpServletResponse response) throws IOException {
//		try {
//			Long newMemberId = registerService.regist(regReq);
//			response.setHeader("Location", "/api/members/" + newMemberId);
//			response.setStatus(HttpServletResponse.SC_CREATED);
//		} catch (DuplicateMemberException dupEx) {
//			response.sendError(HttpStatus.NOT_FOUND.value());
//		}
//	}
//
//	public void setRegisterService(MemberRegisterService registerService) {
//		this.registerService = registerService;
//	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

}
