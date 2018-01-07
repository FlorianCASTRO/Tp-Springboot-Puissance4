package Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import com.igs.ipi.tpspringbootcastro.modele.GameModel;

@Component
@Scope(value ="session", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class PartieEnCours {

	@Autowired
	public GameModel gameModel;

	public GameModel getGameModel(GameModel gameModel) {
		return gameModel;
	}

	public void setGameModel(GameModel gameModel) {
		this.gameModel = gameModel;
	}
	
	
	
}
