package SpringDataJDBC.repository;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import SpringDataJDBC.model.User;

@Component
public class UserDAO implements IUserDAO{
		//devo stabilire una connessione con db
	@Autowired JdbcTemplate jdbcTemplate;

		@Override
		public void insert(User u) {
		String sql= "INSERT INTO public.user (name, lastName, city, age, email)"
				   + "VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sql,u.getName(),u.getLastname(), u.getCity(), u.getAge(), u.getEmail());
		
		}

		@Override
		public void update(User u) {
			String sql ="UPDATE public.user SET name=?, lastName=?, city=?, age=?, email=?";
			jdbcTemplate.update(sql,u.getName(),u.getLastname(), u.getCity(), u.getAge(), u.getEmail());
			
			
		}

		@Override
		public void delete(long id) {
		 String sql ="DELETE FROM public.user WHERE id=?";
		 jdbcTemplate.update(sql, id);
			
		}

		@Override
		public User getByID(long id) {
		String sql= "SELECT * FROM public.user WHERE id=?";
		User u =jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
			return u;
		}

		@Override
		public List<User> gettAll() {
			String sql= "SELECT * FROM public.user";
			List<User> listaUsers = jdbcTemplate.query(sql, new UserRowMapper());
			return listaUsers;
		}

	}


