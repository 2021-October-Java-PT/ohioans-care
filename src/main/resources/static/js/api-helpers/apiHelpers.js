function getRequest(location, callback) {
  fetch(location, {
      mode: 'cors',
      headers: {
        'Content-Type': 'application/json',
      }
    })
    .then((response) => response.json())
    .then((jsonData) => callback(jsonData))
    .catch((err) => console.log(err));
}

function postRequest(location, requestBody, callback) {
  fetch(location, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(requestBody),
    })
    .then((response) => response.json())
    .then((jsonData) => callback(jsonData))
    .catch((err) => console.log(err));
}

function putRequest(location, requestBody, callback) {
  fetch(location, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(requestBody),
    })
    .then((response) => response.json())
    .then((jsonData) => callback(jsonData))
    .catch((err) => console.log(err));
}

function deleteRequest(location, callback) {
  fetch(location, {
      method: 'DELETE',
      headers: {
        'Content-Type': 'application/json',
      },
    })
    .then((response) => response.json())
    .then((jsonData) => callback(jsonData))
    .catch((err) => console.log(err));
}

const useState = (defaultValue) => {
  let value = defaultValue;
  const getValue = () => value
  const setValue = newValue => value = newValue
  return [getValue, setValue];
}

export default {
  getRequest,
  postRequest,
  putRequest,
  deleteRequest,
  useState
};