-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

SELECT movie.title, movie_id
FROM movie
WHERE movie.title = 'Back to the Future';

INSERT INTO movie_actor(movie_id, actor_id)
VALUES ( 105, 7036);